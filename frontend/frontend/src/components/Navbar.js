import React from 'react';
import './Navbar.css';

export default function Navbar() {
  return (
    <nav className="navbar">
      <div className="navbar-logo">Gestor de Finanças</div>
      <ul className="navbar-links">
        <li><a href="/dashboard">Dashboard</a></li>
        <li><a href="/perfis">Perfis</a></li>
        <li><a href="/transacoes">Transações</a></li>
        <li><a href="/relatorios">Relatórios</a></li>
        <li><a href="/login">Sair</a></li>
      </ul>
    </nav>
  );
}