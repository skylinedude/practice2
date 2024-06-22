import {useRoutes} from 'react-router-dom'
import { LessonRoutes } from './lessons/lessons.routes'
import { proRoutes } from './project/project.routes'
import { entryRoute } from './entry/entry'
export default function Allroutes(){
    return useRoutes([LessonRoutes,proRoutes,entryRoute])
}   