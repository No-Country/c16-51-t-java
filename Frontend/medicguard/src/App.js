import './App.css';
import { BrowserRouter, Link, Route, Router, Routes, Switch } from 'react-router-dom';
import Calendar from './Components/Calendar';
import Guards from './Components/Guards';
import Home from './Components/Home';

function App() {
  return (
   <>
   <BrowserRouter>
    <div className='divNav'>
      <nav className='navbar'>
        <ul>
          <li>
            <Link to="/"> Home </Link>
          </li>
          <li>
            <Link to="/calendario"> Calendario </Link>
          </li>
          <li>
            <Link to="/guardia"> Guardias </Link>
          </li>
        </ul>
      </nav>

      <hr/>

      <Routes>
        <Route path="/calendario" element={<Calendar/>}/> 
         
        <Route path="/guardia" element={<Guards/>}/>
       
        <Route path="/" element={<Home/>}/>
       
      </Routes>

    </div>

   </BrowserRouter>
   </>
  );
}

export default App;
