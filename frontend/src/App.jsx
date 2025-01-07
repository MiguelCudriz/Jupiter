import React from 'react';
import { Routes, Route, Link } from 'react-router-dom';
import { useAuth } from './context/AuthContext'; // Asegúrate de importar el hook useAuth
import Home from './components/Home';
import FetchAll from './components/FetchAll';
import Login from './components/Login';
import ProtectedRoute from './components/ProtectedRoute';

function App() {
    const { isAuthenticated, logout, login } = useAuth();  // Accede a los valores del contexto

    return (
        <div>
            <nav>
                <ul>
                    <li><Link to="/">Inicio</Link></li>
                    {isAuthenticated && (
                        <>
                            <li><Link to="/gestion">Gestión de Miembros</Link></li>
                            <li><Link to="/reportes">Visualizar Reportes</Link></li>
                            <li><button onClick={logout}>Cerrar Sesión</button></li>
                        </>
                    )}
                    {!isAuthenticated && <li><Link to="/login">Iniciar Sesión</Link></li>}
                </ul>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/login" element={<Login onLogin={login} />} />
                <Route
                    path="/gestion"
                    element={
                        <ProtectedRoute>
                            <FetchAll />
                        </ProtectedRoute>
                    }
                />
                <Route
                    path="/reportes"
                    element={
                        <ProtectedRoute>
                            <h1>Reportes</h1>
                        </ProtectedRoute>
                    }
                />
            </Routes>
        </div>
    );
}

export default App;
