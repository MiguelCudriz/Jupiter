// src/FetchAll.jsx
import React, { useEffect, useState } from 'react';

function FetchAll() {
    const [members, setMembers] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/ar_ribos')
            .then((response) => response.json())
            .then((data) => setMembers(data))
            .catch((error) => console.error('Error:', error));
    }, []);

    return (
        <div>
            <h2>Gestión de Miembros</h2>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Sede</th>
                    <th>Turno</th>
                </tr>
                </thead>
                <tbody>
                {members.map((member) => (
                    <tr key={member.id}>
                        <td>{member.id}</td>
                        <td>{member.nomFunci}</td>
                        <td>{member.sede}</td>
                        <td>{member.turno}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}

export default FetchAll;
