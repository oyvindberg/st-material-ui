package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyClassesMod {
  
  @JSImport("@mui/material/Typography/typographyClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Typography/typographyClasses", JSImport.Default)
  @js.native
  val default: TypographyClasses = js.native
  
  @scala.inline
  def getTypographyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.body2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.body1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.caption
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.button
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h3
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h4
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h5
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h6
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subtitle1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subtitle2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.overline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignLeft
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignCenter
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignRight
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignJustify
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.noWrap
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutterBottom
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paragraph
  */
  trait TypographyClassKey extends StObject
  
  @js.native
  trait TypographyClasses extends StObject {
    
    /** Styles applied to the root element if `align="center"`. */
    var alignCenter: String = js.native
    
    /** Styles applied to the root element if `align="justify"`. */
    var alignJustify: String = js.native
    
    /** Styles applied to the root element if `align="left"`. */
    var alignLeft: String = js.native
    
    /** Styles applied to the root element if `align="right"`. */
    var alignRight: String = js.native
    
    /** Styles applied to the root element if `variant="body1"`. */
    var body1: String = js.native
    
    /** Styles applied to the root element if `variant="body2"`. */
    var body2: String = js.native
    
    /** Styles applied to the root element if `variant="button"`. */
    var button: String = js.native
    
    /** Styles applied to the root element if `variant="caption"`. */
    var caption: String = js.native
    
    /** Styles applied to the root element if `gutterBottom={true}`. */
    var gutterBottom: String = js.native
    
    /** Styles applied to the root element if `variant="h1"`. */
    var h1: String = js.native
    
    /** Styles applied to the root element if `variant="h2"`. */
    var h2: String = js.native
    
    /** Styles applied to the root element if `variant="h3"`. */
    var h3: String = js.native
    
    /** Styles applied to the root element if `variant="h4"`. */
    var h4: String = js.native
    
    /** Styles applied to the root element if `variant="h5"`. */
    var h5: String = js.native
    
    /** Styles applied to the root element if `variant="h6"`. */
    var h6: String = js.native
    
    /** Styles applied to the root element if `variant="inherit"`. */
    var inherit: String = js.native
    
    /** Styles applied to the root element if `nowrap={true}`. */
    var noWrap: String = js.native
    
    /** Styles applied to the root element if `variant="overline"`. */
    var overline: String = js.native
    
    /** Styles applied to the root element if `paragraph={true}`. */
    var paragraph: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="subtitle1"`. */
    var subtitle1: String = js.native
    
    /** Styles applied to the root element if `variant="subtitle2"`. */
    var subtitle2: String = js.native
  }
  object TypographyClasses {
    
    @scala.inline
    def apply(
      alignCenter: String,
      alignJustify: String,
      alignLeft: String,
      alignRight: String,
      body1: String,
      body2: String,
      button: String,
      caption: String,
      gutterBottom: String,
      h1: String,
      h2: String,
      h3: String,
      h4: String,
      h5: String,
      h6: String,
      inherit: String,
      noWrap: String,
      overline: String,
      paragraph: String,
      root: String,
      subtitle1: String,
      subtitle2: String
    ): TypographyClasses = {
      val __obj = js.Dynamic.literal(alignCenter = alignCenter.asInstanceOf[js.Any], alignJustify = alignJustify.asInstanceOf[js.Any], alignLeft = alignLeft.asInstanceOf[js.Any], alignRight = alignRight.asInstanceOf[js.Any], body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], gutterBottom = gutterBottom.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyClasses]
    }
    
    @scala.inline
    implicit class TypographyClassesMutableBuilder[Self <: TypographyClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignCenter(value: String): Self = StObject.set(x, "alignCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignJustify(value: String): Self = StObject.set(x, "alignJustify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignLeft(value: String): Self = StObject.set(x, "alignLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignRight(value: String): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody1(value: String): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2(value: String): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterBottom(value: String): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1(value: String): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2(value: String): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3(value: String): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4(value: String): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5(value: String): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6(value: String): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInherit(value: String): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrap(value: String): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverline(value: String): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1(value: String): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2(value: String): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
    }
  }
}
