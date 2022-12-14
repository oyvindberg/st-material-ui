package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorInvertedColors
import com.olvind.mui.muiJoy.anon.SheetPropsSheetTypeMapdivdefaultComponen
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetSheetPropsMod {
  
  type SheetOwnerState = ApplyColorInversion[SheetPropsSheetTypeMapdivdefaultComponen]
  
  type SheetProps[D /* <: ElementType */, P] = OverrideProps[SheetTypeMap[P, D], D]
  
  trait SheetPropsColorOverrides extends StObject
  
  trait SheetPropsVariantOverrides extends StObject
  
  type SheetSlot = "root"
  
  trait SheetTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ColorInvertedColors
  }
  object SheetTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ColorInvertedColors): SheetTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (SheetTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ColorInvertedColors): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
