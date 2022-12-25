package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Ref
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxBoxPropsMod {
  
  type BoxProps[D /* <: ElementType */, P] = OverrideProps[BoxTypeMap[P, D], D]
  
  type BoxSlot = "root"
  
  trait BoxTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SystemProps[Theme] & Ref
  }
  object BoxTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & SystemProps[Theme] & Ref): BoxTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (BoxTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SystemProps[Theme] & Ref): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
