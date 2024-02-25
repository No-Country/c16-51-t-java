import React from "react";
import { useState } from "react";
import { Button, Card, Modal } from "react-bootstrap";

const CardProfessional = () => {
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  return (
    <>
      <ul className="accordion">
        <li>
          <input type="radio" name="accordion" id="first" />
          <label htmlFor="first">José Andrada</label>
          <div className="content">
            <Card.Body>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Fecha de Nacimiento:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>18/04/1992</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>D.N.I:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>37586972</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Matrícula:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>98785</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Antiguedad en la institución:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>5 años</Card.Text>
                </div>
              </div>
            </Card.Body>
            <div className="pt-5">
              <Button className="btnDardeBaja" onClick={handleShow}>
                Dar de Baja
              </Button>{" "}
              <Button className="btnEditarPerfil">Editar Perfil</Button>
            </div>
          </div>
        </li>
        <li>
          <input type="radio" name="accordion" id="second" />
          <label htmlFor="second">José Andrada</label>
          <div className="content">
            <Card.Body>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Fecha de Nacimiento:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>18/04/1992</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>D.N.I:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>37586972</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Matrícula:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>98785</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Antiguedad en la institución:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>5 años</Card.Text>
                </div>
              </div>
            </Card.Body>
            <div className="pt-5">
              <Button className="btnDardeBaja" onClick={handleShow}>
                Dar de Baja
              </Button>{" "}
              <Button className="btnEditarPerfil">Editar Perfil</Button>
            </div>
          </div>
        </li>
        <li>
          <input type="radio" name="accordion" id="third" />
          <label htmlFor="third">José Andrada</label>
          <div className="content">
            <Card.Body>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Fecha de Nacimiento:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>18/04/1992</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>D.N.I:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>37586972</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Matrícula:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>98785</Card.Text>
                </div>
              </div>
              <div className="row">
                <div className="col-md-8 col-sm-8">
                  <Card.Title>Antiguedad en la institución:</Card.Title>
                </div>
                <div className="col-md-4 col-sm-4">
                  <Card.Text>5 años</Card.Text>
                </div>
              </div>
            </Card.Body>
            <div className="pt-5">
              <Button className="btnDardeBaja" onClick={handleShow}>
                Dar de Baja
              </Button>{" "}
              <Button className="btnEditarPerfil">Editar Perfil</Button>
            </div>
          </div>
        </li>
      </ul>

      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton></Modal.Header>
        <Modal.Body>
          <div className="py-5">
            <h3 className="txtAviso">¿Deseas dar de baja a este perfil?</h3>
          </div>
          <div>
            <Button className="btnCancelar" onClick={handleClose}>
              Cancelar
            </Button>{" "}
            <Button className="btnAceptarBaja" onClick={handleClose}>
              Aceptar
            </Button>
          </div>
        </Modal.Body>
      </Modal>
    </>
  );
};

export default CardProfessional;
