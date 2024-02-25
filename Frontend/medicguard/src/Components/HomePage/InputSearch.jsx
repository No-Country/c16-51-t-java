import React from "react";
import { Form } from "react-bootstrap";
import Dropdown from "react-bootstrap/Dropdown";

const InputSearch = () => {
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
        </div>
      </div>
    </>
  );
};

export default InputSearch;
