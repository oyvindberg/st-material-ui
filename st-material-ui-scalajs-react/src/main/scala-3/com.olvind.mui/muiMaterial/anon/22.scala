package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22`[SecondaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SecondaryTypographyComponent] = js.undefined
}
object `22` {
  
  inline def apply[SecondaryTypographyComponent /* <: ElementType */](): `22`[SecondaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`22`[SecondaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`[?], SecondaryTypographyComponent /* <: ElementType */] (val x: Self & `22`[SecondaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: SecondaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
