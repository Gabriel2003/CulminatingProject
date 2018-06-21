/*
 * Gabriel Hurtado
 * June 13th, 2018.
 * RECIPES PROGRAM.
 * A program that displays varied recipes according to people's
 * cravings of nutriotious food  .
 */

package Recipes;

/**
 * A program available to everyone that enjoys food!
 * @author gahur1962
 */
public class Program extends javax.swing.JFrame {

    /**
     * Creates new form Program
     */
    public Program() {
        initComponents();
    }
    
    private void KraftDinner(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 pkg. (150 g) Kraft Dinner Smart Vegetables\n "+ 
               "  Macaroni and Cheese\n" +
               "- 2cups Big-Batch Beef, thawed\n" +
               "- 1cup Classico di Napoli Tomato\n "+ 
               "- 1cup Basil Pasta Sauce\n" +
               "- 1cup Cracker Barrel Shredded\n"+ 
               "  Light 4 Cheese Italiano Cheese\n ");
        
preparation = (" PREPARATION:\n" +
               "- Prepare Kraft Dinner Smart as directed\n" +
               "  on package, using the microwave directions\n." +
               "- Meanwhile, combine meat and sauce.\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
    
  private void MexicanTacos(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 pound lean (at least 80%) ground beef/n" +
               "- 1 cup Old El Paso™ Thick 'n Chunky salsa/n" +
               "- 10 Old El Paso™ taco shells\n" +
               "- 1/2 head lettuce, shredded\n" +
               "- 1 medium tomato, chopped (3/4 cup)/n" +
               "- 1 cup shredded Cheddar cheese (4 ounces)\n" );
        
preparation = (" PREPARATION:\n" +
               "- Cook beef in 10-inch skillet over medium heat 8 to 10 minutes, "
        +      "  stirring occasionally, until brown; drain.\n" +
               "- Stir salsa into beef. Heat to boiling, stirring constantly; reduce heat to medium-low.\n"
        +      "  Cook 5 minutes, stirring occasionally. Pour beef mixture into large serving bowl.\n " +
               "- Heat taco shells as directed on package. Serve taco shells with beef mixture,"
        +      "  lettuce, tomato and cheese.\n" ); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
  private void SouthernFriedChicken(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 3-lb. fryer\n" +
               "- 1 tbsp. salt\n" +
               "- 1 tbsp. black pepper\n" +
               "- 2 eggs (beaten)\n" +
               "- 1/2 cup Pet milk\n" +
               "- 1/2 cup water\n" +
               "- 2 cups flour\n" +
               "- 1 tsp. paprika\n" +
               "- 1/4 tsp. ground thyme\n" +
               "- 1/2 tsp. granulated garlic\n" +
               "- 1 qt. oil for frying");
        
preparation = (" PREPARATION:\n" +
               "- Cut chicken in eight pieces. Season well with salt and pepper.\n "
        + "       Set aside. Mix eggs, milk, and water. Pour mixture over chicken\n"
        + "       Let sit for 5 minutes.\n" +
                "- In a heavy paper bag, mix flour, paprika, ground thyme, and granulated\n"
        + "       garlic. Place chicken in bag with flour mixture. Shake until\n "
        + "       chicken is well coated.\n" +
               "- Heat oil in a Magnalite fryer — oil should reach 350°F.\n "
        +        "Place chicken in hot oil. Fry, turning as chicken browns.\n " +
                " Heavy parts such as breast, thighs, and legs will take 15 to 20 minutes\n" +
                 "wings about 10 to 15 minutes. Drain chicken on paper towels." ); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
    private void ShrimpStirFry(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +  
               "- 1 tablespoon olive oil\n" +
               "- 1 1/2 pounds medium shrimp, peeled and deveined\n" +
               "- 24 ounces broccoli florets*\n" +
               "- 1 teaspoon sesame seeds\n" +
               "- 1 green onion, thinly " +
               "FOR THE SAUCE:\n" +
               "- 3 tablespoons reduced sodium soy\n  " + 
               "- 2 tablespoons oyster sauce\n" + 
              " -  1 tablespoon rice wine vinegar\n" +
              " -  1 tablespoon brown sugar, packed\n" +
              " -  1 tablespoon freshly grated ginger\n" +
              " -  2 cloves garlic, minced\n" +
              " -  1 teaspoon sesame oil\n" +
              " -  1 teaspoon cornstarch\n" +
              " -  1 teaspoon Sriracha, optional");
        
preparation = (" PREPARATION:\n" +
               "- In a small bowl, whisk together soy sauce, oyster sauce, rice wine vinegar,\n" +
               "  brown sugar, ginger, garlic, sesame oil, cornstarch and Sriracha, \n." +
               "  if using; set aside..\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
    private void GreekBurger(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 pkg. (150 g) Kraft Dinner Smart Vegetables\n "+ 
               "  Macaroni and Cheese\n" +
               "- 2cups Big-Batch Beef, thawed\n" +
               "- 1cup Classico di Napoli Tomato\n "+ 
               "- 1cup Basil Pasta Sauce\n" +
               "- 1cup Cracker Barrel Shredded\n"+ 
               "  Light 4 Cheese Italiano Cheese\n ");
        
preparation = (" PREPARATION:\n" +
               "- Prepare Kraft Dinner Smart as directed\n" +
               "  on package, using the microwave directions\n." +
               "- Meanwhile, combine meat and sauce.\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
  private void Paella (){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 tbsp olive oil\n" +
               "- 1 chopped onion\n" +
               "- 1 tsp each hot smoked paprika and dried thyme\n" +
               "- 300g paella or risotto rice\n"+
               "- 3 tbsp dry sherry or white wine (optional)\n" +
               "- 400g can chopped tomatoes with garlic\n" +
               "- 900ml chicken stock\n" +
               "- 400g bag frozen seafood mix\n" +
               "- juice ½ lemon other half cut into wedges\n" +
               "- handful flat-leaf parsley roughly chopped");
        
preparation = (" PREPARATION:\n" +
              "- Heat the oil in a large frying pan or wok. Add the onion and soften for 5 mins.\"\n" +
              " Stir in the paprika, thyme and rice, stir for 1 min, then splash in\n" +
              " the Sherry or wine, if using. Once it has evaporated, stir in the tomatoes and stock.\n" +
              " Season and cook, uncovered, for about 15 mins, stirring now and again until rice is almost\n" +
              "tender and still surrounded with some liquid.\n" + 
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
   private void AsparagusandPeas(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 2 thin pancetta slices (about 5/8 ounce)\n " +
               "- 1 large garlic clove, thinly sliced\n "
        +      "- 2/3 cup unsalted chicken stock\n "
        +      "- 3 ounces 1/3-less-fat cream cheese (about 1/3 cup)\n"
        +      "- 3 tablespoons mascarpone cheese\n "
        +      "- 8 ounces uncooked pappardelle (wide ribbon pasta)\n"
        +      "- 1 1/2 cups (1-inch) asparagus pieces\n "
        +      "- 1/2 cup frozen green peas\n "
        +      "- 1/2 teaspoon kosher salt\n "
        +      "- 1/4 teaspoon freshly ground black pepper\n"
        +      "- 1 tablespoon chopped fresh flat-leaf parsley\n "
        +      "- 1 tablespoon thinly sliced fresh chives\n");
        
preparation = (" PREPARATION:\n" +
               "- Prepare Kraft Dinner Smart as directed\n" +
               "  on package, using the microwave directions\n." +
               "- Meanwhile, combine meat and sauce.\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
 private void CacaoBlueberry(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 cup (140 g) of blueberries (fresh or frozen)\n" +
               "- 1 banana (fresh or frozen)\n" +
               "- 1 tbsp raw cacao powder\n" +
               "- 1/2 cup (118 ml) coconut milk\n" +
               "- Large handful of ice or 1 cup (235 ml) coconut water\n" +
               "- 1 date\n " + 
               "- 2 tsp chia seeds\n" );
        
preparation = (" PREPARATION:\n" +
               "-Place all ingredients in blender.\n" +
               "- Blend on high until smooth, about 45 – 60 seconds.\n" +
               "- Serve and enjoy!" );

IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
    private void AsianChicken(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 pkg. (150 g) Kraft Dinner Smart Vegetables\n "+ 
               "  Macaroni and Cheese\n" +
               "- 2cups Big-Batch Beef, thawed\n" +
               "- 1cup Classico di Napoli Tomato\n "+ 
               "- 1cup Basil Pasta Sauce\n" +
               "- 1cup Cracker Barrel Shredded\n"+ 
               "  Light 4 Cheese Italiano Cheese\n ");
        
preparation = (" PREPARATION:\n" +
               "- Prepare Kraft Dinner Smart as directed\n" +
               "  on package, using the microwave directions\n." +
               "- Meanwhile, combine meat and sauce.\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }
 private void SalmonHash(){
        String ingredients; 
        String preparation; 
        
ingredients = (" INGREDIENTS:\n" +
               "- 1 pkg. (150 g) Kraft Dinner Smart Vegetables\n "+ 
               "  Macaroni and Cheese\n" +
               "- 2cups Big-Batch Beef, thawed\n" +
               "- 1cup Classico di Napoli Tomato\n "+ 
               "- 1cup Basil Pasta Sauce\n" +
               "- 1cup Cracker Barrel Shredded\n"+ 
               "  Light 4 Cheese Italiano Cheese\n ");
        
preparation = (" PREPARATION:\n" +
               "- Prepare Kraft Dinner Smart as directed\n" +
               "  on package, using the microwave directions\n." +
               "- Meanwhile, combine meat and sauce.\n" +
               "- Layer half each of the Kraft Dinner Smart,\n " + 
               "  meat mixture and cheese in 8-inch square microwaveable dish; repeat layers.\n" +
               "- Microwave on MEDIUM 10 min. or until heated through. "); 
        
IngredientsArea.setText(ingredients);
PreparationArea.setText(preparation);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mexicanradio = new javax.swing.JRadioButton();
        Kraftradio = new javax.swing.JRadioButton();
        creamyradio = new javax.swing.JRadioButton();
        paellaradio = new javax.swing.JRadioButton();
        friedradio = new javax.swing.JRadioButton();
        greekradio = new javax.swing.JRadioButton();
        quinoaradio = new javax.swing.JRadioButton();
        cacaoradio = new javax.swing.JRadioButton();
        stirradio = new javax.swing.JRadioButton();
        salmonradio = new javax.swing.JRadioButton();
        SelectButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        IngredientsArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        PreparationArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Recipes Program");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Please select one of the recipes : ");

        mexicanradio.setText("Mexican Tacos ");
        mexicanradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexicanradioActionPerformed(evt);
            }
        });

        Kraftradio.setText("Kraft Dinner");
        Kraftradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KraftradioActionPerformed(evt);
            }
        });

        creamyradio.setText("Creamy Pasta with Asparagus and Peas");
        creamyradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamyradioActionPerformed(evt);
            }
        });

        paellaradio.setText("Paella");
        paellaradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paellaradioActionPerformed(evt);
            }
        });

        friedradio.setText("Southern Fried Chicken");
        friedradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friedradioActionPerformed(evt);
            }
        });

        greekradio.setText("Big-Fat Greek Burger");

        quinoaradio.setText("Asian Chicken and Quinoa Salad");

        cacaoradio.setText("Cacao and Blueberry mix");
        cacaoradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacaoradioActionPerformed(evt);
            }
        });

        stirradio.setText("Shripm Strir-fry");
        stirradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stirradioActionPerformed(evt);
            }
        });

        salmonradio.setText("Salmon Hash");
        salmonradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salmonradioActionPerformed(evt);
            }
        });

        SelectButton.setText("Select ");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        IngredientsArea.setColumns(20);
        IngredientsArea.setRows(5);
        jScrollPane1.setViewportView(IngredientsArea);

        PreparationArea.setColumns(20);
        PreparationArea.setRows(5);
        jScrollPane2.setViewportView(PreparationArea);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(friedradio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stirradio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greekradio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quinoaradio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salmonradio)
                                    .addComponent(cacaoradio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mexicanradio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kraftradio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creamyradio)
                            .addComponent(paellaradio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(57, 57, 57)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paellaradio)
                            .addComponent(Kraftradio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mexicanradio)
                            .addComponent(creamyradio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(friedradio)
                            .addComponent(cacaoradio)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quinoaradio)
                            .addComponent(stirradio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salmonradio)
                            .addComponent(greekradio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SelectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mexicanradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexicanradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mexicanradioActionPerformed

    private void KraftradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KraftradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KraftradioActionPerformed

    private void creamyradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creamyradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creamyradioActionPerformed

    private void friedradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friedradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friedradioActionPerformed

    private void paellaradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paellaradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paellaradioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Making Gui able to exit, press F1 or exit:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed
        // After creating the methods, if satatements will be used to called the methods already created:
        
        if (Kraftradio.isSelected()){
            KraftDinner(); 
        }
        else if (paellaradio.isSelected()){
            
            Paella(); 
        }
         else if (friedradio.isSelected()){
            
            SouthernFriedChicken(); 
        }
         else if (cacaoradio.isSelected()){
            
            CacaoBlueberry(); 
        }
         else if (creamyradio.isSelected()){
            
            AsparagusandPeas(); 
        }
         else if (mexicanradio.isSelected()){
            
            MexicanTacos(); 
        }
         else if (mexicanradio.isSelected()){
            
           ShrimpStirFry(); 
        }
         else if (mexicanradio.isSelected()){
            
            MexicanTacos(); 
        }
         else if (mexicanradio.isSelected()){
            
            MexicanTacos(); 
        }
         else if (mexicanradio.isSelected()){
            
            MexicanTacos(); 
        } 
         else {
            
            MexicanTacos(); 
        }
    }//GEN-LAST:event_SelectButtonActionPerformed

    private void cacaoradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacaoradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cacaoradioActionPerformed

    private void stirradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stirradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stirradioActionPerformed

    private void salmonradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salmonradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salmonradioActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // The clear button will be in charge of delteing the information given:
        Kraftradio.setSelected(false);
        cacaoradio.setSelected(false);
        salmonradio.setSelected(false);
        creamyradio.setSelected(false);
        mexicanradio.setSelected(false);
        paellaradio.setSelected(false);
        stirradio.setSelected(false);
        friedradio.setSelected(false);
        quinoaradio.setSelected(false);
        greekradio.setSelected(false);
        PreparationArea.setText(null);
        IngredientsArea.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextArea IngredientsArea;
    private javax.swing.JRadioButton Kraftradio;
    private javax.swing.JTextArea PreparationArea;
    private javax.swing.JButton SelectButton;
    private javax.swing.JRadioButton cacaoradio;
    private javax.swing.JRadioButton creamyradio;
    private javax.swing.JRadioButton friedradio;
    private javax.swing.JRadioButton greekradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton mexicanradio;
    private javax.swing.JRadioButton paellaradio;
    private javax.swing.JRadioButton quinoaradio;
    private javax.swing.JRadioButton salmonradio;
    private javax.swing.JRadioButton stirradio;
    // End of variables declaration//GEN-END:variables
}
