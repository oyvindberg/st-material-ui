package com.olvind.mui.muiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useControlledMod {
  
  @js.native
  trait UseControlledProps[T] extends StObject {
    
    /**
      * The default value when uncontrolled.
      */
    var default: js.UndefOr[T] = js.native
    
    /**
      * Holds the component value when it's controlled.
      */
    var controlled: js.UndefOr[T] = js.native
    
    /**
      * The component name displayed in warnings.
      */
    var name: String = js.native
    
    /**
      * The name of the state variable displayed in warnings.
      */
    var state: js.UndefOr[String] = js.native
  }
  object UseControlledProps {
    
    @scala.inline
    def apply[T](name: String): UseControlledProps[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseControlledProps[T]]
    }
    
    @scala.inline
    implicit class UseControlledPropsMutableBuilder[Self <: UseControlledProps[_], T] (val x: Self with UseControlledProps[T]) extends AnyVal {
      
      @scala.inline
      def setControlled(value: T): Self = StObject.set(x, "controlled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlledUndefined: Self = StObject.set(x, "controlled", js.undefined)
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
