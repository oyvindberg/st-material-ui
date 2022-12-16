package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Clickable
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipMod extends Shortcut {
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    *
    * Demos:
    *
    * - [Chip](https://mui.com/material-ui/react-chip/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/material-ui/api/chip/)
    */
  @JSImport("@mui/material/Chip/Chip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = js.native
  
  type ChipProps[D /* <: ReactElement */, P] = OverrideProps[ChipTypeMap[P, D], D]
  
  trait ChipPropsColorOverrides extends StObject
  
  trait ChipPropsSizeOverrides extends StObject
  
  trait ChipPropsVariantOverrides extends StObject
  
  trait ChipTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Clickable
  }
  object ChipTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Clickable): ChipTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ChipTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Clickable): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `chipChipMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = default
}
