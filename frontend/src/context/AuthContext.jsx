import React, { createContext, useState, useContext } from 'react';

// Crea un contexto para autenticación
const AuthContext = createContext();

// Proveedor del contexto de autenticación
export const AuthProvider = ({ children }) => {
    const [isAuthenticated, setIsAuthenticated] = useState(false);

    const login = () => setIsAuthenticated(true);
    const logout = () => setIsAuthenticated(false);

    return (
        <AuthContext.Provider value={{ isAuthenticated, login, logout }}>
            {children}
        </AuthContext.Provider>
    );
};

// Hook para acceder a los valores de autenticación
export const useAuth = () => useContext(AuthContext);
