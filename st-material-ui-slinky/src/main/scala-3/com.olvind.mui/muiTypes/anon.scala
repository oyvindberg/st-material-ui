package com.olvind.mui.muiTypes

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Component[C /* <: ReactElement */] extends StObject {
    
    /**
      * The component used for the root node.
      * Either a string to use a HTML element or a component.
      */
    var component: C
  }
  object Component {
    
    inline def apply[C /* <: ReactElement */](component: C): Component[C] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component[?], C /* <: ReactElement */] (val x: Self & Component[C]) extends AnyVal {
      
      inline def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
}
