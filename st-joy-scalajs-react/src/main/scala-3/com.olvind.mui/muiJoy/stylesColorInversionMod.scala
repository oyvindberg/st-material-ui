package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.GetColor
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesColorInversionMod {
  
  @JSImport("@mui/joy/styles/ColorInversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/styles/ColorInversion", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[js.Array[VariantProp]]] = js.native
  
  inline def ColorInversionProvider(param0: ColorInversionProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorInversionProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useColorInversion(): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorInversion")().asInstanceOf[GetColor]
  inline def useColorInversion(childVariant: VariantProp): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorInversion")(childVariant.asInstanceOf[js.Any]).asInstanceOf[GetColor]
  
  trait ColorInversionProviderProps extends StObject {
    
    var children: Node
    
    var variant: js.UndefOr[VariantProp] = js.undefined
  }
  object ColorInversionProviderProps {
    
    inline def apply(): ColorInversionProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ColorInversionProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorInversionProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVariant(value: VariantProp): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
