package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[PrimaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.undefined
}
object `18` {
  
  inline def apply[PrimaryTypographyComponent /* <: ElementType */](): `18`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[PrimaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`[?], PrimaryTypographyComponent /* <: ElementType */] (val x: Self & `18`[PrimaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
