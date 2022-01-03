package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.SelectHTMLAttributes
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectInputMod extends Shortcut {
  
  @JSImport("@mui/material/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[NativeSelectInputProps] = js.native
  
  trait NativeSelectInputProps
    extends StObject
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var IconComponent: ElementType
    
    var inputRef: js.UndefOr[Ref[HTMLSelectElement]] = js.undefined
    
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object NativeSelectInputProps {
    
    inline def apply(IconComponent: ElementType): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal(IconComponent = IconComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    extension [Self <: NativeSelectInputProps](x: Self) {
      
      inline def setIconComponent(value: ElementType): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setInputRef(value: Ref[HTMLSelectElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLSelectElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLSelectElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectInputMod.foo` */
  override def _to: JSXElementConstructor[NativeSelectInputProps] = default
}
