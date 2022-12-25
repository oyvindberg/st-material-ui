package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DisableGutters
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerPropsMod {
  
  type ContainerProps[D /* <: ReactElement */, P] = OverrideProps[ContainerTypeMap[P, D], D]
  
  type ContainerSlot = "root"
  
  trait ContainerTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisableGutters
  }
  object ContainerTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & DisableGutters): ContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ContainerTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
