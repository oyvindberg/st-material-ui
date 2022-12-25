package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Direction
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SystemProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackStackPropsMod {
  
  type StackProps[D /* <: ElementType */, P] = OverrideProps[StackTypeMap[P, D], D]
  
  type StackSlot = "root"
  
  trait StackTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Direction & SystemProps
  }
  object StackTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Direction & SystemProps): StackTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (StackTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Direction & SystemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
