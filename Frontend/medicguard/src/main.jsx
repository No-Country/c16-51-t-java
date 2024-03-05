import React from 'react'
import ReactDOM from 'react-dom/client'
// import Generalogin from './Components/Login/Generalogin'
import './Components/Login/Css/styles.css'
// import './Components/HomePage/Home'
import Home from './Components/HomePage/Home'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    {/* <Generalogin></Generalogin> */}
    <Home/>
  </React.StrictMode>,
);
