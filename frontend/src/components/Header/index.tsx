import './styles.css'
import logo from '../../assets/img/madrugador.png'

function Header(){
    return(
        <header>
            <div className="dsmeta-logo-container">
                    <img src={logo} alt="DSMeta" />
                    <h1>DsMeta</h1>
                    <p>
                        Deselvolvido por 
                        <a href="http://www.madrugas.com.br"> Madrugas Soluções em TI</a>
                    </p>
            </div>
        </header>
    )
}
export default Header