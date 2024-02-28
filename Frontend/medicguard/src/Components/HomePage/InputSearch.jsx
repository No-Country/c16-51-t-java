import React from "react";
import { useState } from "react";
import { Form, Button, Image, Modal } from "react-bootstrap";
import Dropdown from "react-bootstrap/Dropdown";
import Container from "react-bootstrap/Container";
import Col from "react-bootstrap/Col";
import Row from "react-bootstrap/Row";
import profile from "../css/imageProfiles/profile.jpg";

const InputSearch = () => {
  const [showAddProfile, setShowAddProfile] = useState(false);

  const addProfileClose = () => setShowAddProfile(false);
  const addProfileShow = () => setShowAddProfile(true);

  // Cargar Imagen
  const [image, setImage] = useState("");

  const handleImageChange = (event) => {
    const file = event.target.files[0];
    if (file && file.type.substring(0, 5) === "image") {
      setImage(file);
    } else {
      setImage(null);
    }
  };

  const handleImageClick = () => {
    document.getElementById("file-input").click();
  };

  return (
    <>
      <div className="row">
        <div className="col-md-8">
          <div className="py-4">
            <div className="input-group">
              <Form.Control
                type="text"
                placeholder="Buscar Profesional"
                className="textSearch"
              />
              <div className="input-group-append">
                <span className="input-group-text iconSearch">
                  <i class="bi bi-search"></i>
                </span>
              </div>
            </div>
          </div>
        </div>
        <div className="col-md-4">
          <div className="py-4">
            <Dropdown
              className="custom-dropdown d-inline mx-2"
              autoClose="inside"
            >
              <Dropdown.Toggle id="dropdown-autoclose-inside">
                Filtrar
              </Dropdown.Toggle>
              <Dropdown.Menu className="custom-dropdown-menu">
                <Dropdown.Item eventKey="X">Psiquiatra</Dropdown.Item>
                <Dropdown.Item eventKey="X">Psicologo</Dropdown.Item>
                <Dropdown.Item eventKey="X">Asistente Social</Dropdown.Item>
              </Dropdown.Menu>
            </Dropdown>
          </div>
          <div className="mx-2">
            <Button className="btnAddProfile" onClick={addProfileShow}>
              Agregar Perfil
            </Button>
          </div>
        </div>
      </div>

      <Modal
        show={showAddProfile}
        onHide={addProfileClose}
        size="lg"
        aria-labelledby="example-modal-sizes-title-lg"
      >
        <Modal.Header closeButton>
        </Modal.Header>
        <Modal.Body className="grid-example">
          <Form>
            <Container>
              <Row>
                <Col xs={12} md={12} lg={12}>
                  {/* .col-xs-6 .col-md-6 */}
                  <div className="justify-content-md-center">
                    <div
                      className="image-container mt-4"
                      onClick={handleImageClick}
                    >
                      <Image className="imageProfile" src={profile} />
                    </div>
                    <Form.Group>
                      <Form.Control
                        id="file-input"
                        type="file"
                        accept="/image/*"
                        onChange={handleImageChange}
                        style={{ display: "none" }}
                      ></Form.Control>
                    </Form.Group>
                    <Form.Label>Subir Nueva Foto de Perfil</Form.Label>
                  </div>
                </Col>
              </Row>
              <Row>
                <Col xs={6} md={6} lg={6}>
                  <Form.Group>
                    <Form.Label>Nombre</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
                <Col xs={6} md={6} lg={6}>
                  <Form.Group>
                    <Form.Label>Apellido</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
              </Row>
              <Row>
                <Col xs={6} md={6} lg={6}>
                  <Form.Group>
                    <Form.Label>D.N.I</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
                <Col xs={6} md={6} lg={6}>
                  <Form.Group>
                    <Form.Label>Matrícula</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
              </Row>
              <Row>
                <Col xs={12} md={12} lg={12}>
                  <Form.Group>
                    <Form.Label>Domicilio</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
                <Col xs={12} md={12} lg={12}>
                  <Form.Group>
                    <Form.Label>E-mail</Form.Label>
                    <Form.Control type="email" autoFocus></Form.Control>
                  </Form.Group>
                </Col>

                <Col xs={12} md={12} lg={12}>
                  <Form.Group>
                    <Form.Label>Nombre de Usuario</Form.Label>
                    <Form.Control type="text" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
                <Col xs={12} md={12} lg={12}>
                  <Form.Group>
                    <Form.Label>Contraseña</Form.Label>
                    <Form.Control type="password" autoFocus></Form.Control>
                  </Form.Group>
                </Col>
              </Row>
            </Container>
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button className="btnCancelarPerfil" onClick={addProfileClose}>
            Cancelar
          </Button>{" "}
          <Button className="btnAgregarPerfil" onClick={addProfileClose}>
            Agregar Perfil
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
};

export default InputSearch;
