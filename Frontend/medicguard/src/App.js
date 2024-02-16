import './App.css';
import { BrowserRouter, Link, Route, Router, Routes, Switch } from 'react-router-dom';
import Calendar from './Components/Calendar';
import Guards from './Components/Guards';
import Home from './Components/Home';

function App() {
  return (
    <>
      <BrowserRouter>
        <div className='div-nav'>
          <nav className='navbar'>
            <ul>

                <div className='list-item'>
                  <img src='image.png' alt='Logo' className='logo' />
                  <span> MedicGuard </span>
                </div>

              <li>
                <Link to="/"> Home </Link>
              </li>

              <li>
                <Link to="/calendar"> Calendario </Link>
              </li>

              <li>
                <Link to="/guards"> Guardias </Link>
              </li>

            </ul>
          </nav>

          <hr />

          <Routes>
            <Route path="/calendar" element={<Calendar />} />

            <Route path="/guards" element={<Guards />} />

            <Route path="/" element={<Home />} />

          </Routes>

        </div>

      </BrowserRouter>
    </>
  );
}

export default App;
