import { Multi } from "./fragment/Multi";
import { Test } from "./react-component/Test";
import { Boundary } from "./rules/Boundary";
import { Flower } from "./rules/Flower";
import { Naming } from "./rules/Naming";

function App() {
  return (
   <>
   <Multi/>
   <Test/>
   <Naming/>
   <Boundary/>
   <Flower/>
   </>
  );
}

export default App;
