package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Clickable
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipMod extends Shortcut {
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    *
    * Demos:
    *
    * - [Chips](https://mui.com/components/chips/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/api/chip/)
    */
  @JSImport("@mui/material/Chip/Chip", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = js.native
  
  type ChipProps[D /* <: ElementType */, P] = OverrideProps[ChipTypeMap[P, D], D]
  
  @js.native
  trait ChipPropsColorOverrides extends StObject
  
  @js.native
  trait ChipPropsSizeOverrides extends StObject
  
  @js.native
  trait ChipPropsVariantOverrides extends StObject
  
  @js.native
  trait ChipTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Clickable = js.native
  }
  object ChipTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Clickable): ChipTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ChipTypeMapMutableBuilder[Self <: ChipTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (ChipTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Clickable): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `chipChipMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = default
}
