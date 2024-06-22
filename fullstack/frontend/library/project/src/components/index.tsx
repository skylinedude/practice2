import { useRoutes } from "react-router-dom";
import { lessonsRoutes } from "./routes/lessons/lessons.routes";
import { entryRoute } from "./routes/entry/entry";
import { proRoutes } from "./routes/projects/project.routes";

export default function Allroutes(){
return useRoutes([lessonsRoutes,entryRoute,proRoutes])
}