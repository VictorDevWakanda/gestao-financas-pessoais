import axios from 'axios';

const API_URL = 'http://localhost:8080/gestao-financas/api/usuario';

export const criarUsuario = (dados) => axios.post(API_URL, dados);
export const buscarUsuario = (id) => axios.get(`${API_URL}/${id}`);