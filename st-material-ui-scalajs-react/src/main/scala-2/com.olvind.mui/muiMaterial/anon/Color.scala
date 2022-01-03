package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.PartialBadgeUnstyledClasses
import com.olvind.mui.muiMaterial.muiMaterialStrings.circular
import com.olvind.mui.muiMaterial.muiMaterialStrings.default
import com.olvind.mui.muiMaterial.muiMaterialStrings.dot
import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.rectangular
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[js.UndefOr[PartialBadgeUnstyledClasses] with AnchorOriginBottomLeftCircular] = js.native
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'default'
    */
  var color: js.UndefOr[primary | secondary | default | error | info | success | warning] = js.native
  
  /**
    * Wrapped shape the badge should overlap.
    * @default 'rectangular'
    */
  var overlap: js.UndefOr[rectangular | circular] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The variant to use.
    * @default 'standard'
    */
  var variant: js.UndefOr[standard | dot] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.UndefOr[PartialBadgeUnstyledClasses] with AnchorOriginBottomLeftCircular): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: primary | secondary | default | error | info | success | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOverlap(value: rectangular | circular): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setVariant(value: standard | dot): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
