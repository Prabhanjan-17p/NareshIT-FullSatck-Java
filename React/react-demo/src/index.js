import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import '../node_modules/bootstrap-icons/font/bootstrap-icons.css'
import bootstrap from 'bootstrap';
import { Home } from './components/Home-ex/home';
import { DataBinding } from './components/Data-Binding/data-binding';
import { UseS } from './components/Data-Binding/use-state';
import { MouseEvent } from './components/Mouse-Event/mouse-event';
import { MouseAnimation } from './components/Mouse-Animation/mouse-animation';
import { ClassBinding } from './components/Class-Binding/class-binding';
import { MouseMove } from './components/Mouse-Move/mouse-move';
import { KeyDemo } from './components/Key-Demo/key-demo';
import { DebounceDemo } from './components/Debounce-Demo/debounce-demo';
import { ThrottleDemo } from './components/Throttle-Demo/throttle-demo';
import { FakeStoreProducts } from './components/FakeStore-API/fakestore-product';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <FakeStoreProducts />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
