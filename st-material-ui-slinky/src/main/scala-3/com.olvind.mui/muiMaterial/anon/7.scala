package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[DefaultComponent /* <: ReactElement */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.undefined
}
object `7` {
  
  inline def apply[DefaultComponent /* <: ReactElement */](): `7`[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[DefaultComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?], DefaultComponent /* <: ReactElement */] (val x: Self & `7`[DefaultComponent]) extends AnyVal {
    
    inline def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
