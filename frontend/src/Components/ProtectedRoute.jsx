import React from 'react';
import { Navigate } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';

function ProtectedRoute({ children }) {
    const { isAuthenticated } = useAuth();

    if (!isAuthenticated) {
        // Si no está autenticado, redirige a la página de login
        return <Navigate to="/login" />;
    }

    return children; // Si está autenticado, muestra el contenido protegido
}

export default ProtectedRoute;
