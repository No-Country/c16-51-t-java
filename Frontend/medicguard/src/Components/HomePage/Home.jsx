import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './Header';
import InputSearch from './InputSearch';
import CardProfessional from './CardProfessional';

function Home() {
  return (
    <div>
        <Header/>
        <div className="row">
            <div className="col-md-2"></div>
            <div className="col-md-10">
                <InputSearch/>
                <CardProfessional/>
                {/* <h1>Home Page!!!!!!!!</h1> */}
            </div>
        </div>
        
    </div>
  );
}

export default Home;
