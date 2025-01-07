// src/components/Login.jsx
import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

function Login({ onLogin }) {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError('');

        // Simula la autenticación llamando al backend
        if (username === 'admin' && password === 'password') {
            onLogin(); // Actualiza el estado de autenticación
            navigate('/'); // Redirige a la página principal
        } else {
            setError('Credenciales inválidas');
        }
    };

    return (
        <div>
            <h1>Inicio de Sesión</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Usuario:</label>
                    <input
                        type="text"
                        value={username}
                        onChange={(e) => setUsername(e.target.value)}
                    />
                </div>
                <div>
                    <label>Contraseña:</label>
                    <input
                        type="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                    />
                </div>
                {error && <p style={{ color: 'red' }}>{error}</p>}
                <button type="submit">Iniciar Sesión</button>
            </form>
        </div>
    );
}

export default Login;
