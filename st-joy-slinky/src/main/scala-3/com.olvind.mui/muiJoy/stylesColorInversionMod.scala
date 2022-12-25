package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.GetColor
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
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
    
    var children: ReactElement
    
    var variant: js.UndefOr[VariantProp] = js.undefined
  }
  object ColorInversionProviderProps {
    
    inline def apply(children: ReactElement): ColorInversionProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorInversionProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorInversionProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: VariantProp): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
