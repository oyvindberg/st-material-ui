package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[DefaultComponent /* <: ElementType */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.undefined
}
object `8` {
  
  inline def apply[DefaultComponent /* <: ElementType */](): `8`[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[DefaultComponent]]
  }
  
  extension [Self <: `8`[?], DefaultComponent /* <: ElementType */](x: Self & `8`[DefaultComponent]) {
    
    inline def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
