// import React from "react";
// import "./index.css";

// function TextField({ labelText, onChange }) {

//     return (
//         <div className="textfield">
//             <label data-testid="label"></label>
//             <input data-testid="input" onChange={null}></input>
//         </div>
//     );
// }

// export default TextField;



import './App.css';
import TextField from "./components/textField";
import 'h8k-components';

const title = "Text Append";

function App() {


  return (
    <div>
      <h8k-navbar header={title}></h8k-navbar>
      <div className="layout-row align-items-centre justify-content-center mt-50">
        <section className="layout-column">
          <div data-testid="first-text">
            <TextField labelText={'First Text'} onChange={null}/>
          </div >
          <div data-testid="second-text">
            <TextField labelText={'Second Text'} onChange={null}/>
          </div>
          <label className="mt-50 text-align-center">
            Appended Text is: 
          </label>
          <label className="mt-10 finalText" data-testid="final-text">

          </label>
        </section>
      </div>
    </div>
  );
}

export default App;


chat gpt said : 

import React, { useState } from "react";
import './App.css';
import TextField from "./components/textField";
import 'h8k-components';

const title = "Text Append";

function App() {
  const [firstText, setFirstText] = useState('');
  const [secondText, setSecondText] = useState('');

  // Combine texts with a space, trimming extra if any field is empty
  const appendedText = `${firstText} ${secondText}`.trim();

  return (
    <div>
      <h8k-navbar header={title}></h8k-navbar>
      <div className="layout-row align-items-centre justify-content-center mt-50">
        <section className="layout-column">
          <div data-testid="first-text">
            <TextField 
              labelText="First Text" 
              value={firstText}
              onChange={(e) => setFirstText(e.target.value)} 
            />
          </div>

          <div data-testid="second-text">
            <TextField 
              labelText="Second Text" 
              value={secondText}
              onChange={(e) => setSecondText(e.target.value)} 
            />
          </div>

          <label className="mt-50 font-green-700 text-align-center">
            Appended Text is:
          </label>
          <label className="mt-10 finalText" data-testid="final-text">
            {appendedText}
          </label>
        </section>
      </div>
    </div>
  );
}

export default App;


import React from "react";

const TextField = ({ labelText, value, onChange }) => {
  return (
    <div>
      <label data-testid="label">{labelText}</label>
      <input 
        data-testid="input" 
        type="text" 
        value={value} 
        onChange={onChange} 
      />
    </div>
  );
};

export default TextField;

