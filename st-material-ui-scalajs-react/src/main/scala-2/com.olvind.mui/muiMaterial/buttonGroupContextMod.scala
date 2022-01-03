package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.contained
import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.large
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupContextMod extends Shortcut {
  
  /**
    * @ignore - internal component.
    */
  @JSImport("@mui/material/ButtonGroup/ButtonGroupContext", JSImport.Default)
  @js.native
  val default: Context[IButtonGroupContext] = js.native
  
  @js.native
  trait IButtonGroupContext extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[inherit | primary | secondary | error | info | success | warning] = js.native
    
    var disableElevation: js.UndefOr[Boolean] = js.native
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fullWidth: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large] = js.native
    
    var variant: js.UndefOr[text | outlined | contained] = js.native
  }
  object IButtonGroupContext {
    
    @scala.inline
    def apply(): IButtonGroupContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonGroupContext]
    }
    
    @scala.inline
    implicit class IButtonGroupContextMutableBuilder[Self <: IButtonGroupContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: inherit | primary | secondary | error | info | success | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
      
      @scala.inline
      def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVariant(value: text | outlined | contained): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = Context[IButtonGroupContext]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupContextMod.foo` */
  override def _to: Context[IButtonGroupContext] = default
}
