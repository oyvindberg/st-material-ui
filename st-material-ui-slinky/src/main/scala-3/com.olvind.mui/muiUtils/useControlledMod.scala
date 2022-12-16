package com.olvind.mui.muiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useControlledMod {
  
  trait UseControlledProps[T] extends StObject {
    
    /**
      * The default value when uncontrolled.
      */
    var default: js.UndefOr[T] = js.undefined
    
    /**
      * Holds the component value when it's controlled.
      */
    var controlled: js.UndefOr[T] = js.undefined
    
    /**
      * The component name displayed in warnings.
      */
    var name: String
    
    /**
      * The name of the state variable displayed in warnings.
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object UseControlledProps {
    
    inline def apply[T](name: String): UseControlledProps[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseControlledProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseControlledProps[?], T] (val x: Self & UseControlledProps[T]) extends AnyVal {
      
      inline def setControlled(value: T): Self = StObject.set(x, "controlled", value.asInstanceOf[js.Any])
      
      inline def setControlledUndefined: Self = StObject.set(x, "controlled", js.undefined)
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
