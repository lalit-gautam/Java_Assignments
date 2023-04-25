import logo from './logo.svg';
import './App.css';
import UseStateExample01 from './useState/UseStateExample01';
import UseStateExample02 from './useState/UseStateExample02';
import UseStateExample03 from './useState/UseStateExample03';
import UseEffectExample01 from './useEffect/useEffectExample01';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import UseNavigate01 from './useNavigate/UseNavigate01';
import About from './useNavigate/About';
import UseLocation01 from './useLocation/UseLocation01';
import { Router, Link } from 'react-router-dom';
import UseRef02 from './UseRef/UseRef02';
import UseRef03 from './UseRef/UseRef03';
import UseRef04 from './UseRef/UseRef04';
import UseMemo from './useMemo/UseMemo';
import Reducer01 from './useReducer/UseReducer01';
import UseCallBack01 from './useCallBack/UseCallBack01';
import Parent from './forwardRef/Parent';
function App() {
  return (
    <div className="App">
      {/* <UseEffectExample01></UseEffectExample01> */}
      {/* <BrowserRouter>
          <Routes>
              <Route exact path="/" element={<UseNavigate01/>}/>
              <Route exact path="/about" element={<About/>}/>
          </Routes>
       </BrowserRouter> */}
      {/* <Router> */}
      {/* <div className="container">
          <h2>
            Testing the useLocation hook in React
          </h2>

          <button>
            <Link to='/products/school?name=bags'>Click Me</Link>
          </button>
          <UseLocation01 />

        </div>
      </Router> */}
      {/* <UseRef02></UseRef02> */}
      {/* <UseRef03></UseRef03> */}
      {/* <UseRef04></UseRef04> */}
      {/* <UseMemo></UseMemo> */}
      {/* <UseCallBack01></UseCallBack01> */}
      {/* <Reducer01></Reducer01> */}
      {/* <Parent></Parent> */}
      {/* <UseLocation01></UseLocation01> */}
      <Router>
        <div className="container">
          <h2>
            Testing the useLocation hook in React
          </h2>

          <button>
            <Link to={{
              pathname: "/courses",
              search: "?sort=name",
              hash: "#the-hash",
              state: { fromDashboard: true }
            }}>Click Me</Link>
          </button>
          <UseLocation01 />

        </div>
      </Router>
    </div>
  );
}

export default App;
