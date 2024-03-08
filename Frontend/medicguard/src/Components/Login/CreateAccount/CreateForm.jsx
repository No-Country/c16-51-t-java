import React, { useState } from 'react';
import CreateCopy from './CreateCopy';
import CreateInputContainer from './CreateInputContainer';
import CreateLoginContainer from './CreateLoginContainer';
import ComboBox from "./ComboBox";
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080';

axios.interceptors.request.use(function (config) {
  const token = localStorage.getItem('jwtToken');
  config.headers.Authorization = token ? `Bearer ${token}` : '';
  return config;
});

const CreateForm = () => {
  const [nombre, setNombre] = useState('');
  const [apellido, setApellido] = useState('');
  const [email, setEmail] = useState('');
  const [contraseña, setContraseña] = useState('');
  const [role, setRole] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    const userData = {
      firstname: nombre,
      lastname: apellido,
      email: email,
      password: contraseña,
      role: role,
    };

    try {
      const response = await axios.post(`${API_BASE_URL}/api/auth/register`, userData);
      
      // Suponiendo que el backend responde con un token JWT cuando el registro es exitoso
      const token = response.data.token;
      localStorage.setItem('jwtToken', token); // Guarda el token en localStorage

      console.log('Registration Success:', response.data);
      // Aquí puedes redirigir al usuario o hacer otras acciones post registro
    } catch (error) {
      console.error('Error during registration:', error);
      // Aquí debes manejar los errores, como mostrar un mensaje al usuario
    }
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <CreateCopy id="welcome" />
        <CreateInputContainer label="Nombre" type="text" name="fname" id="fname" value={nombre} onChange={(e) => setNombre(e.target.value)} />
        <CreateInputContainer label="Apellido" type="text" name="lname" id="lname" value={apellido} onChange={(e) => setApellido(e.target.value)} />
        <CreateInputContainer label="E-mail" type="email" name="email" id="email" value={email} onChange={(e) => setEmail(e.target.value)} />
        <CreateInputContainer label="Contraseña" type="password" name="password" id="password" value={contraseña} onChange={(e) => setContraseña(e.target.value)} />

        <ComboBox
          label="Role"
          options={[
            { label: 'Admin', value: 'ADMIN' }, // Ensure options are in uppercase
            { label: 'User', value: 'USER' },
          ]}
          value={role}
          onChange={(e) => setRole(e.target.value)}
        />
        <CreateLoginContainer onSubmit={handleSubmit}/>
      </form>
    </>
  );
};

export default CreateForm;