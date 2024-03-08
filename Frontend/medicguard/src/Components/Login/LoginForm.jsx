import React, { useState } from 'react';
import FormInput from './FormInput';
import Link from './Link';
import axios from 'axios';
import Button from './Button';

const API_BASE_URL = 'http://localhost:8080';

const LoginForm = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.post(`${API_BASE_URL}/api/auth/login`, {
        username,
        password,
      });
      // Suponiendo que tu backend responde con un token en la propiedad 'token'
      const { token } = response.data;

      if (token) {
        localStorage.setItem('jwtToken', token); // Guarda el token en localStorage
        window.location.href = '/src/Components/PopUp'; // Reemplaza '/dashboard' con la ruta a la que deseas redirigir
      } else {
        // Manejar la falta de un token en la respuesta
        console.log('Inicio de sesión exitoso, pero no se recibió token.');
      }
    } catch (error) {
      console.error('Error durante el inicio de sesión:', error);
      // Aquí puedes agregar manejo de errores específicos, como mostrar mensajes de error al usuario
    }
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <section className="copy" id="welcome">
          <h2>Bienvenido</h2>
          <FormInput label="Usuario" type="text" name="username" id="username" value={username} onChange={(e) => setUsername(e.target.value)} />
          <FormInput label="Contraseña" type="password" name="password" id="password" value={password} onChange={(e) => setPassword(e.target.value)} />
          <Link href="/forgot-password">Olvidé mi contraseña<strong> Click aquí para recuperar</strong></Link>
          <Button type="submit">Iniciar Sesión</Button>
        </section>
      </form>
    </>
  );
};

export default LoginForm;
