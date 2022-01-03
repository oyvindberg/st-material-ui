package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressClassesMod {
  
  @JSImport("@mui/material/LinearProgress/linearProgressClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/LinearProgress/linearProgressClasses", JSImport.Default)
  @js.native
  val default: LinearProgressClasses = js.native
  
  inline def getLinearProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinearProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.determinate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.indeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.buffer
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.query
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dashed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dashedColorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dashedColorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.barColorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.barColorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar1Indeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar1Determinate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar1Buffer
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar2Indeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.bar2Buffer
  */
  trait LinearProgressClassKey extends StObject
  
  trait LinearProgressClasses extends StObject {
    
    /** Styles applied to the layered bar1 and bar2 elements. */
    var bar: String
    
    /** Styles applied to the bar1 element if `variant="buffer"`. */
    var bar1Buffer: String
    
    /** Styles applied to the bar1 element if `variant="determinate"`. */
    var bar1Determinate: String
    
    /** Styles applied to the bar1 element if `variant="indeterminate or query"`. */
    var bar1Indeterminate: String
    
    /** Styles applied to the bar2 element if `variant="buffer"`. */
    var bar2Buffer: String
    
    /** Styles applied to the bar2 element if `variant="indeterminate or query"`. */
    var bar2Indeterminate: String
    
    /** Styles applied to the bar elements if `color="primary"`; bar2 if `variant` not "buffer". */
    var barColorPrimary: String
    
    /** Styles applied to the bar elements if `color="secondary"`; bar2 if `variant` not "buffer". */
    var barColorSecondary: String
    
    /** Styles applied to the root element if `variant="buffer"`. */
    var buffer: String
    
    /** Styles applied to the root and bar2 element if `color="primary"`; bar2 if `variant="buffer"`. */
    var colorPrimary: String
    
    /** Styles applied to the root and bar2 elements if `color="secondary"`; bar2 if `variant="buffer"`. */
    var colorSecondary: String
    
    /** Styles applied to the additional bar element if `variant="buffer"`. */
    var dashed: String
    
    /** Styles applied to the additional bar element if `variant="buffer"` and `color="primary"`. */
    var dashedColorPrimary: String
    
    /** Styles applied to the additional bar element if `variant="buffer"` and `color="secondary"`. */
    var dashedColorSecondary: String
    
    /** Styles applied to the root element if `variant="determinate"`. */
    var determinate: String
    
    /** Styles applied to the root element if `variant="indeterminate"`. */
    var indeterminate: String
    
    /** Styles applied to the root element if `variant="query"`. */
    var query: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object LinearProgressClasses {
    
    inline def apply(
      bar: String,
      bar1Buffer: String,
      bar1Determinate: String,
      bar1Indeterminate: String,
      bar2Buffer: String,
      bar2Indeterminate: String,
      barColorPrimary: String,
      barColorSecondary: String,
      buffer: String,
      colorPrimary: String,
      colorSecondary: String,
      dashed: String,
      dashedColorPrimary: String,
      dashedColorSecondary: String,
      determinate: String,
      indeterminate: String,
      query: String,
      root: String
    ): LinearProgressClasses = {
      val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bar1Buffer = bar1Buffer.asInstanceOf[js.Any], bar1Determinate = bar1Determinate.asInstanceOf[js.Any], bar1Indeterminate = bar1Indeterminate.asInstanceOf[js.Any], bar2Buffer = bar2Buffer.asInstanceOf[js.Any], bar2Indeterminate = bar2Indeterminate.asInstanceOf[js.Any], barColorPrimary = barColorPrimary.asInstanceOf[js.Any], barColorSecondary = barColorSecondary.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], dashed = dashed.asInstanceOf[js.Any], dashedColorPrimary = dashedColorPrimary.asInstanceOf[js.Any], dashedColorSecondary = dashedColorSecondary.asInstanceOf[js.Any], determinate = determinate.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearProgressClasses]
    }
    
    extension [Self <: LinearProgressClasses](x: Self) {
      
      inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBar1Buffer(value: String): Self = StObject.set(x, "bar1Buffer", value.asInstanceOf[js.Any])
      
      inline def setBar1Determinate(value: String): Self = StObject.set(x, "bar1Determinate", value.asInstanceOf[js.Any])
      
      inline def setBar1Indeterminate(value: String): Self = StObject.set(x, "bar1Indeterminate", value.asInstanceOf[js.Any])
      
      inline def setBar2Buffer(value: String): Self = StObject.set(x, "bar2Buffer", value.asInstanceOf[js.Any])
      
      inline def setBar2Indeterminate(value: String): Self = StObject.set(x, "bar2Indeterminate", value.asInstanceOf[js.Any])
      
      inline def setBarColorPrimary(value: String): Self = StObject.set(x, "barColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setBarColorSecondary(value: String): Self = StObject.set(x, "barColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDashed(value: String): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setDashedColorPrimary(value: String): Self = StObject.set(x, "dashedColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setDashedColorSecondary(value: String): Self = StObject.set(x, "dashedColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeterminate(value: String): Self = StObject.set(x, "determinate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
