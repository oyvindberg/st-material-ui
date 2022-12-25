package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemPropsColorOverrides
import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nested extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, ListItemPropsColorOverrides]] = js.undefined
  
  /**
    * The element to display at the end of ListItem.
    */
  var endAction: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the component can contain NestedList.
    * @default false
    */
  var nested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The element to display at the start of ListItem.
    */
  var startAction: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the component has sticky position (with top = 0).
    * @default false
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, ListItemPropsVariantOverrides]] = js.undefined
}
object Nested {
  
  inline def apply(): Nested = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nested]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nested] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, ListItemPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndAction(value: ReactElement): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
    
    inline def setEndActionUndefined: Self = StObject.set(x, "endAction", js.undefined)
    
    inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setStartAction(value: ReactElement): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    
    inline def setStartActionUndefined: Self = StObject.set(x, "startAction", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, ListItemPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
