import './styles.css'
import icon from '../../assets/img/notificacao2.png'

function NotificationButton(){
    return(
        <div className="dsmeta-red-btn">
            <img src={icon } alt="Notificar" />
        </div>
    )
}
export default NotificationButton