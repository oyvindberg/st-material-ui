package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.`column-reverse`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`row-reverse`
import com.olvind.mui.muiMaterial.muiMaterialStrings.column
import com.olvind.mui.muiMaterial.muiMaterialStrings.row
import com.olvind.mui.muiSystem.mod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    * @default 'column'
    */
  var direction: js.UndefOr[ResponsiveStyleValue[row | `row-reverse` | column | `column-reverse`]] = js.native
  
  /**
    * Add an element between each child.
    */
  var divider: js.UndefOr[ReactElement] = js.native
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[Any]] = js.native
  
  /**
    * Defines the space between immediate children.
    * @default 0
    */
  var spacing: js.UndefOr[ResponsiveStyleValue[Double | String]] = js.native
  
  /**
    * The system prop, which allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object Direction {
  
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDirection(value: ResponsiveStyleValue[row | `row-reverse` | column | `column-reverse`]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: ((row | `row-reverse` | column | `column-reverse`) | Null)*): Self = StObject.set(x, "direction", js.Array(value :_*))
    
    @scala.inline
    def setDivider(value: ReactElement): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setSpacing(value: ResponsiveStyleValue[Double | String]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setSpacingVarargs(value: ((Double | String) | Null)*): Self = StObject.set(x, "spacing", js.Array(value :_*))
    
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
  }
}
