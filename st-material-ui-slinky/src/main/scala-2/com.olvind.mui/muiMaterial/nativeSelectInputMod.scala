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
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSelectElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectInputMod extends Shortcut {
  
  @JSImport("@mui/material/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[NativeSelectInputProps] = js.native
  
  @js.native
  trait NativeSelectInputProps
    extends StObject
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var IconComponent: ReactElement = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLSelectElement]] = js.native
    
    var sx: js.UndefOr[SxProps[Theme]] = js.native
    
    var variant: js.UndefOr[standard | outlined | filled] = js.native
  }
  object NativeSelectInputProps {
    
    @scala.inline
    def apply(IconComponent: ReactElement): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal(IconComponent = IconComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    @scala.inline
    implicit class NativeSelectInputPropsMutableBuilder[Self <: NativeSelectInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconComponent(value: ReactElement): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRef(value: Ref[HTMLSelectElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLSelectElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefReactRef(value: ReactRef[HTMLSelectElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSxNull: Self = StObject.set(x, "sx", null)
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value :_*))
      
      @scala.inline
      def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = JSXElementConstructor[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectInputMod.foo` */
  override def _to: JSXElementConstructor[NativeSelectInputProps] = default
}
