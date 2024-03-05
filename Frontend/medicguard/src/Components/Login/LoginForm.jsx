import React from 'react'
import FormInput from './FormInput'
import Link from './Link'
import Copy from './Copy'
import Button from './Button'
const LoginForm = () => {
  return (
    <>
    <form>
      <section className="copy" id="welcome">
        <h2>Bienvenido</h2>
        <FormInput label="Usuario" type="text" name="fname" id="fname" />
        <FormInput label="Contraseña" type="password" name="lname" id="lname" />
        <Link href="/forgot-password">
          Olvidé mi contraseña<strong> Click aqui para recuperar</strong>
        </Link>
        <Button type="submit">Iniciar Sesión</Button>
      </section>
    </form>
    </>
  )
}

export default LoginForm
