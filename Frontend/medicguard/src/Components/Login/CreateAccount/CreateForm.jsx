import React, { useState } from 'react';
import CreateCopy from './CreateCopy';
import CreateInputContainer from './CreateInputContainer';
import CreateLoginContainer from './CreateLoginContainer';
import ComboBox from "./ComboBox";

const CreateForm = () => {
  const [nombre, setNombre] = useState(''); // State for the Nombre field
  const [apellido, setApellido] = useState(''); // State for the Apellido field
  const [email, setEmail] = useState(''); // State for the Email field
  const [contraseña, setContraseña] = useState(''); // State for the Contraseña field
  const [role, setRole] = useState(''); // State for the Role field (already present)

  // Form submission handler
  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent the default form submission
    // Log the form data to the console
    console.log({
      nombre,
      apellido,
      email,
      contraseña,
      role,
    });
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
            { label: 'Admin', value: 'admin' },
            { label: 'User', value: 'user' },
          ]}
          value={role}
          onChange={(e) => setRole(e.target.value)}
        />
        {/* Update CreateLoginContainer to include the submit button if it's not already handled */}
        <CreateLoginContainer />
      </form>
    </>
  );
};

export default CreateForm;