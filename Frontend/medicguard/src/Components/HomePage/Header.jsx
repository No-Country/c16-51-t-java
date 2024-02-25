import React from "react";
import Container from 'react-bootstrap/Container';
// import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Button } from "react-bootstrap";
const Header = () => {
    return (
        <>
            <Navbar className="header">
                <Container>
                    <Navbar.Brand href="#home">Medic Guard</Navbar.Brand>
                    <Button className="logOut">Cerrar Sesión</Button>
                </Container>
            </Navbar>
        </>
    );
}

export default Header; 