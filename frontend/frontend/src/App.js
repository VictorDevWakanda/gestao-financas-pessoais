import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Login from './pages/Login';
import CadastroUsuario from './pages/CadastroUsuario';
import Dashboard from './pages/Dashboard';
import Perfis from './pages/Perfis';
import Transacoes from './pages/Transacoes';
import Relatorios from './pages/Relatorios';

function App() {
  const [usuario, setUsuario] = useState(null);

  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login onLogin={setUsuario} />} />
        <Route path="/cadastro" element={<CadastroUsuario />} />
        <Route
          path="/dashboard"
          element={usuario ? <Dashboard usuario={usuario} /> : <Navigate to="/login" />}
        />
        <Route
          path="/perfis"
          element={usuario ? <Perfis usuario={usuario} /> : <Navigate to="/login" />}
        />
        <Route
          path="/transacoes"
          element={usuario ? <Transacoes usuario={usuario} /> : <Navigate to="/login" />}
        />
        <Route
          path="/relatorios"
          element={usuario ? <Relatorios usuario={usuario} /> : <Navigate to="/login" />}
        />
        <Route path="*" element={<Navigate to="/login" />} />
      </Routes>
    </Router>
  );
}

export default App;
