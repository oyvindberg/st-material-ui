package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21`[PrimaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.undefined
}
object `21` {
  
  inline def apply[PrimaryTypographyComponent /* <: ElementType */](): `21`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`[PrimaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`[?], PrimaryTypographyComponent /* <: ElementType */] (val x: Self & `21`[PrimaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
