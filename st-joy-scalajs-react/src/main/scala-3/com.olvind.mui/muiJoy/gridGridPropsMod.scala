package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.`0`
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SystemProps
import com.olvind.mui.muiSystem.unstableGridGridPropsMod.GridBaseProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridGridPropsMod {
  
  type GridProps[D /* <: ElementType */, P] = OverrideProps[GridTypeMap[P, D], D]
  
  type GridSlot = "root"
  
  trait GridTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & GridBaseProps & `0` & SystemProps
  }
  object GridTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & GridBaseProps & `0` & SystemProps): GridTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (GridTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & GridBaseProps & `0` & SystemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
