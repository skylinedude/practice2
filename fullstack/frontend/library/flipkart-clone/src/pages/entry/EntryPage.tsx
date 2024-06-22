import { Link } from 'react-router-dom'
import './entry.css'
export const Entrypage=()=>{
    return <div className="entry-container">
        <h1>were do u want o go</h1>
        <div className='entry-content'>
           <Link to={'/lessons'}>
        <button>lesoons</button></Link>
        <button>project</button>
        </div>
       
    </div>
}