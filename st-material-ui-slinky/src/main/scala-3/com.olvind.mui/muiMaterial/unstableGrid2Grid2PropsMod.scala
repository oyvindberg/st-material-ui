package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.`38`
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.muiSystem.unstableGridGridPropsMod.GridBaseProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableGrid2Grid2PropsMod {
  
  type Grid2Props[D /* <: ReactElement */, P] = OverrideProps[Grid2TypeMap[P, D], D]
  
  type Grid2Slot = "root"
  
  trait Grid2TypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & GridBaseProps & `38` & SystemProps[Theme]
  }
  object Grid2TypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & GridBaseProps & `38` & SystemProps[Theme]): Grid2TypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid2TypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grid2TypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (Grid2TypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & GridBaseProps & `38` & SystemProps[Theme]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
